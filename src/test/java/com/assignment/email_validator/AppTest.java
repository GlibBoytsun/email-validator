package com.assignment.email_validator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase
{
    public void testRule1()
    {
        assertEquals(0, EmailValidator.Validate("asdfsdfhsregsdfzsdf"));
        assertEquals(1, EmailValidator.Validate("asdfsdfhs@egsdfzsdf"));
    }

    public void testRule2()
    {
        assertEquals(0, EmailValidator.Validate("asdfsdfhsregsdfzsdf"));
        assertEquals(1, EmailValidator.Validate("asdfsdfhs.egsdfzsdf"));
        assertEquals(1, EmailValidator.Validate("asd.sdfhs.egsdf.sdf"));
    }
    
    public void testAllRules()
    {
        assertEquals(0, EmailValidator.Validate("asdfsdfhsregsdfzsdf"));
        assertEquals(1, EmailValidator.Validate("asdfsdfhs@egsdfzsdf"));
        assertEquals(1, EmailValidator.Validate("asdfsdfhs.egsdfzsdf"));
        assertEquals(2, EmailValidator.Validate("asdfsdfhs@egsd.zsdf"));
        assertEquals(2, EmailValidator.Validate("asdf.dfhs@egsd.zsdf"));
        assertEquals(2, EmailValidator.Validate("asdf.dfhs@egsdfzsdf"));
    }
}
