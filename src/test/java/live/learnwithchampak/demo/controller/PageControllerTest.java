package live.learnwithchampak.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

// @WebMvcTest(PageController.class)
class PageControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void homePageShouldRenderTemplate() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attributeExists("headline"))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("Build real HTML pages with Spring Boot and Thymeleaf")));
    }

    @Test
    void helloFormShouldRenderTemplate() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(view().name("hello-form"))
                .andExpect(model().attributeExists("form"));
    }

    @Test
    void helloSubmitShouldRenderResultTemplate() throws Exception {
        mockMvc.perform(post("/hello")
                        .param("name", "Champak")
                        .param("topic", "Fragments")
                        .param("wantsTemplates", "true"))
                .andExpect(status().isOk())
                .andExpect(view().name("hello-result"))
                .andExpect(model().attribute("name", "Champak"))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("Template tip")));
    }
}
