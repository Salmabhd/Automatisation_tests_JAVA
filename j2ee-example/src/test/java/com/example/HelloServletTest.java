package com.example; // Mets ton vrai package ici

import static org.mockito.Mockito.*;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class HelloServletTest {

    
//     class TestableHelloServlet extends helloServlet {
//     @Override
//     public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//         super.doGet(req, resp);
//     }
// }
     @Test
    public void testHelloServlet() throws Exception {
        // Créer les mocks manuellement
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        // Utiliser un vrai StringWriter pour capturer la sortie
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);

        when(response.getWriter()).thenReturn(writer);

        // Créer une instance réelle du Servlet
        helloServlet servlet = new helloServlet();


        // Appeler doGet
        servlet.doGet(request, response);

        // IMPORTANT : flush le writer pour tout écrire dans stringWriter
        writer.flush();

        // Vérifier le contenu écrit
        assert stringWriter.toString().equals("Hello, World!");
    }
}
