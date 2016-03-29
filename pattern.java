package Number;

public class pattern {

	public static void main(String[] args) {
		int a=0,b=2;
        while(b>0){
        if(a==0){
            for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();         }
            a++;
       } else{
            for(int i=1,k=5-1;i<=5-1;i++,k--){
            for(int j=1;j<=k;j++){
                System.out.print(j);            }
            System.out.println();
        }
        }
        b--;
      }

	}

}
