/*
 * package com.tech.oreder.rest;
 * 
 * import static
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
 * 
 * import org.junit.Before; import org.junit.Test; import
 * org.junit.experimental.results.ResultMatchers; import
 * org.junit.runner.RunWith; import org.mockito.InjectMocks; import
 * org.mockito.MockitoAnnotations; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.test.context.ContextConfiguration; import
 * org.springframework.test.context.junit4.SpringJUnit4ClassRunner; import
 * org.springframework.test.context.web.WebAppConfiguration; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.test.web.servlet.ResultMatcher; import
 * org.springframework.test.web.servlet.setup.MockMvcBuilders; import
 * org.springframework.web.context.WebApplicationContext;
 * 
 * 
 * 
 * @RunWith(SpringJUnit4ClassRunner.class)
 * 
 * @ContextConfiguration({"classpath:test-applicationContext.xml"})
 * 
 * @WebAppConfiguration
 * 
 * public class OrderServiceRestControllerTest {
 * 
 * 
 * private MockMvc mockMvc; //our gateway to executing the calls
 * 
 * @InjectMocks OrderServiceRestController ordSvcController;
 * 
 * 
 * @Autowired private WebApplicationContext wac;
 * 
 * @Before public void setup() {
 * 
 * 
 * 
 * this.mockMvc =MockMvcBuilders.webAppContextSetup(this.wac).build();
 * 
 * 
 * }
 * 
 * @Test public void test() throws Exception {
 * 
 * 
 * this.mockMvc.perform(request(HttpMethod.GET,
 * "/health")).andExpect((ResultMatcher)
 * ResultMatchers.isSuccessful())..andExpect(forwardedUrl(
 * OrderServiceRestController));
 * 
 * 
 * 
 * 
 * }
 * 
 * }
 */