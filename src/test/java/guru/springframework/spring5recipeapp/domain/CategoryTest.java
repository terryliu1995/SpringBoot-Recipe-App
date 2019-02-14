package guru.springframework.spring5recipeapp.domain;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

import static org.junit.Assert.*;

public class CategoryTest {
    Category category;

    @Before
    public void setup() {
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() throws Exception {
    }

    @Test
    public void getRecipes() throws Exception {
    }

}