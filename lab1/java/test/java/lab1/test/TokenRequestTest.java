package lab1.test;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lab1.TokenRequest;

public class TokenRequestTest
{
  final Logger log = LoggerFactory.getLogger(TokenRequestTest.class);

  protected static final String CLIENT_ID = "356e592973-summitlab";
  protected static final String CLIENT_SECRET = "2f0bfb2dba04bf30d714";

  @BeforeClass
  public static void setUp()
  throws Exception
  {
  }

  @AfterClass
  public static void tearDown()
  throws Exception
  {
  }

  @Test
  public void testRequest()
  throws Exception
  {
    // insert your test code here
  }
  
  @Test
  public void testParseResponse()
  throws Exception
  {
    // insert your test code here
  }
}
