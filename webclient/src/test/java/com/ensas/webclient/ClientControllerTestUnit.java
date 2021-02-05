package com.ensas.webclient;

import com.ensas.webclient.controllers.ClientController;
import com.ensas.webclient.services.ClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.CoreMatchers.is;

@WebMvcTest(controllers = ClientController.class)
public class ClientControllerTestUnit {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    ClientService clientService;

    @Test
    public void testGetSolde() throws Exception {
        mockMvc.perform(get("/solde")).andExpect(status().isOk());
    }

    @Test
    public void testGetHistorique() throws Exception {
        mockMvc.perform(get("/historique")).andExpect(status().isOk());
    }



}
