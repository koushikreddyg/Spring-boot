package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@SpringBootTest
@AutoConfigureMockMvc
public class GetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {

        MvcResult result = this.mockMvc.perform(post("/post/95").contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Koushik\",\"place\":\"irving\"}")
                

        ).andReturn();
        assertEquals(result.getResponse().getContentAsString(), "{\"name\":\"Koushik\",\"place\":\"irving\",\"age\":\"95\"}");
        assertEquals(result.getResponse().getStatus(), 200);
        // ObjectMapper mapper = new ObjectMapper();

 
        // assertEquals(new Gson().toJson(new Details()), "");

        // try {
        //     String json = mapper.writeValueAsString(new Details());
        //     assertEquals(json, 200);
        // } catch (JsonProcessingException e) {
        //     e.printStackTrace();
        // }

    }
}