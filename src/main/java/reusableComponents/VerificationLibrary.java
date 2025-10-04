package reusableComponents;

import org.testng.Assert;

public class VerificationLibrary 
{
	public boolean verifyTrue(boolean condition) 
	{
		try 
		{
			Assert.assertTrue(condition);
			return true;
		} 
		catch (Throwable var2) 
		{
			return false;
		}
	}
	
	public boolean verifyTrue(boolean condition, String message)
	{
		try 
		{
			Assert.assertTrue(condition, message);
			return true;
		} 
		catch (Throwable var3) 
		{
			return false;
		}
	}
	
	public boolean verifyFalse(boolean condition) 
	{
		try 
		{
			Assert.assertFalse(condition);
			return true;
		} 
		catch (Throwable var2) 
		{
			return false;
		}
	}

	public boolean verifyFalse(boolean condition, String message) 
	{
		try 
		{
			Assert.assertFalse(condition, message);
			return true;
		} 
		catch (Throwable var3) 
		{
			return false;
		}
	}

	public boolean verifyEquals(boolean actual, boolean expected) 
	{
		try 
		{
			Assert.assertEquals(actual, expected);
			return true;
		} 
		catch (Throwable var3) 
		{
			return false;
		}
	}

	public boolean verifyEquals(Object actual, Object expected) 
	{
		try 
		{
			Assert.assertEquals(actual, expected);
			return true;
		} 
		catch (Throwable var3) 
		{
			return false;
		}
	}

	public boolean verifyEquals(String actual, String expected) 
	{
		try 
		{
			Assert.assertEquals(actual, expected);
			return true;
		} 
		catch (Throwable var3) 
		{
			return false;
		}
	}

	public boolean verifyEquals(Object[] actual, Object[] expected) 
	{
		try 
		{
			Assert.assertEquals(actual, expected);
			return true;
		} 
		catch (Throwable var3) 
		{
			return false;
		}
	}

	public boolean fail(String message) 
	{
		try 
		{
			Assert.fail(message);
			return true;
		} 
		catch (Throwable var2) 
		{
			return false;
		}
	}
	
}
