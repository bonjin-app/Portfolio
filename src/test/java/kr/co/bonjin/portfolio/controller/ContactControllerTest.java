package kr.co.bonjin.portfolio.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
class ContactControllerTest {

    @Autowired
    protected MockMvc mockMvc;

    @BeforeAll
    static void initAll() {
        System.out.println("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach - executes before each test method in this class");
    }

    @Test
    @DisplayName("TEST Contact View")
    public void getContactPage() throws Exception {
        mockMvc.perform(get("/contact"))
                .andExpect(status().isOk())
                .andExpect(view().name("contact"));
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }
}