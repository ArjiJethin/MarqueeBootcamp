class jaja
{
static int val;
// class level attributes
// static
static
{
	System.out.printf("Class jaja is Loaded\n");
	val = 1234567890;
}
// object level attributes
int offset;
jaja ( int offset )
{
   this.offset = offset;
}
//offset = yyyy -1980 * 512 + mm * 32 + dd;
void print ()
{
System.out.printf("%d\n", offset);
}

}

class jaja_tester
{
	public static void main( String [] parameters )
	{
		System.out.printf("Val = %d\n", jaja.val);
		jaja obj = new jaja ( 1235);
		obj.print();
		
		
	}
}