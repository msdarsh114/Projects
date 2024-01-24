package com.darsh.pkg2;

public class Demo 
{
	public    int v1=123;
	protected double v2=12.36;
	          long v3=852963741l;
	private   String v4="Darshan";
   
	public void test1()
    {
	    System.out.println("this is public-test1() of pkg-2.Sample class");
	    test4();
    }
   
    protected void test2()
    {
	    System.out.println("this is protected-test2() of pkg-2.Sample class");
	    System.out.println("V4 : "+v4);
    }
    
    void test3()
    {
    	System.out.println("this is pkg-level-test3() of pkg-2.Sample class");
    }
    
    private void test4()
    {
    	System.out.println("this is private-test4() of pkg-2.Sample class");
    }
}
