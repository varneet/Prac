
public class SquareRoot2d {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float hor[] = new float[10];
        float ver[]= new float[10];
        int p=0;
        int q=0;
        float i=0.0f;
        float j=0.0f;
        double sum=0.0f;
        while( p < 3 )
        {     
        	//System.out.println(i);
        	//System.out.println(j);
        	//System.out.println(p);
        	//System.out.println(hor[p]);
        	//System.out.println(ver[p]);
        	//System.out.println("before loop");
               hor[p]=i;
               ver[p]=j;
               i=i+0.1f;
               j=j+1.0f;
               p=p+1;
               //System.out.println(i);
               //System.out.println(j);
               //System.out.println(p);
               //System.out.println(hor[p]);
           	//System.out.println(ver[p]);
           //	System.out.println("afterloop");
      }

      for(p=0;p<3;p++)
      {
           System.out.print(hor[p]+"  ");
           for(q=0;q<3;q++)
           {
               sum=sum+ (Math.sqrt(hor[p]+ver[p]));
               System.out.print(sum+"  ");
          }
          System.out.println();
      }

	}

}
