package guru.springframework.spring5recipeapp.controllers;

import guru.springframework.spring5recipeapp.domain.Recipe;
import guru.springframework.spring5recipeapp.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class IndexControllerTest {
    IndexController indexController;

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);
    }

    @Test
    public void testMocktMVC()throws Exception{
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    @Test
    public void getIndexPage() throws Exception {
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(new Recipe());
        Recipe recipe = new Recipe();
        recipe.setId(1L);
        recipes.add(recipe);

        when(recipeService.getRecipes()).thenReturn(recipes);

        // captor
        ArgumentCaptor<Set<Recipe>> captor = ArgumentCaptor.forClass(Set.class);


        String viewName = indexController.getIndexPage(model);

        assertEquals("index", viewName);

        verify(recipeService, times(1)).getRecipes();
        verify(model, times(1)).addAttribute(eq("recipes"), captor.capture());

        Set<Recipe> setInController = captor.getValue();
        assertEquals(2, setInController.size());
    }

}