
public class Triangles {

	
	
	public static void reverseDiagonal(int n){
		
		
	 for(int row=n;row>0;row--){
		 for(int col=0;col<n;col++){
			
			 if(row == col){
				 System.out.println("*");	 
			 }
			 System.out.print("\t");
		 }
		 System.out.println();
	 }
		
		
		
		
	}
	
	
	
	public static void main(String args[]){
		
		System.out.println("Print triangles");
		
		for(int row=0;row<3;row++){
			
			for(int col = 0;col<3;col++){
				
				if(row < col){
					
					System.out.print("*");
			
				}
				System.out.print("\t");
			}
		System.out.println();
			
			
		}
		
		reverseDiagonal(9);
	}
	
	
}
