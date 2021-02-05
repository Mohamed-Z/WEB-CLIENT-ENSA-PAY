package com.ensas.webclient;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ClientControllerTestInteg {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetListCreancier() throws Exception {
        mockMvc.perform(get("/listCreancier"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nom",is("IAM RECHARGES")));
    }
}
