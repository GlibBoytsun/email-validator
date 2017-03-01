package com.assignment.email_validator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//rule 3 - address contains only one @
//rule 4 - address contains a . after @
public class AppTest extends TestCase
{
    public void testRule1()
    {
        assertEquals(0, EmailValidator.Validate("asdfsdfhsregsdfzsdf"));
        assertEquals(2, EmailValidator.Validate("asdfsdfhs@egsdfzsdf"));
    }

    public void testRule2()
    {
        assertEquals(0, EmailValidator.Validate("asdfsdfhsregsdfzsdf"));
        assertEquals(1, EmailValidator.Validate("asdfsdfhs.egsdfzsdf"));
        assertEquals(1, EmailValidator.Validate("asd.sdfhs.egsdf.sdf"));
    }

    public void testRule3()
    {
        assertEquals(0, EmailValidator.Validate("asdfsdfhsregsdfzsdf"));
        assertEquals(1, EmailValidator.Validate("asdf@dfhsregsd@zsdf"));
        assertEquals(2, EmailValidator.Validate("asdfsdfhs@egsdfzsdf"));
    }

    public void testRule4()
    {
        assertEquals(2, EmailValidator.Validate("asdfsdfhs@egsdfzsdf"));
        assertEquals(3, EmailValidator.Validate("asd.sdfhs@egsdfzsdf"));
        assertEquals(1, EmailValidator.Validate("asd.sdfhsregsdfzsdf"));
        assertEquals(4, EmailValidator.Validate("asdfsdfhs@egsd.zsdf"));
        assertEquals(4, EmailValidator.Validate("asd.sdfhs@egsd.zsdf"));
    }
    
    public void testAllRules()
    {
        assertEquals(0, EmailValidator.Validate("asdfsdfhsregsdfzsdf"));
        assertEquals(2, EmailValidator.Validate("asdfsdfhs@egsdfzsdf"));
        assertEquals(1, EmailValidator.Validate("asdfsdfhs.egsdfzsdf"));
        assertEquals(4, EmailValidator.Validate("asdfsdfhs@egsd.zsdf"));
        assertEquals(4, EmailValidator.Validate("asdf.dfhs@egsd.zsdf"));
        assertEquals(3, EmailValidator.Validate("asdf.dfhs@egsdfzsdf"));
    }
}
