public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int d, int m, int a){
        this.setData(d, m, a);
    }
    
    public void setData(int d, int m, int a){
        boolean bissexto = !((a % 400 != 0) && (a % 4 != 0 || a % 100 == 0));
        
        if( (m >= 1 && m <= 12)){
          this.mes = m;
          this.ano = a;
            
            if( (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d >= 1 && d <= 31) ){
           this.dia = d;
            } else{
                if( (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && (d < 1 || d > 31) ){
                  System.out.println("Digite um dia entre 1 e 31.");
                } 
             }
       
                if( (m == 4 || m == 6 || m == 9 || m == 11) && (d >= 1 && d <= 30) ){
                   this.dia = d;
                } else{
                    if( (m == 4 || m == 6 || m == 9 || m == 11) && (d < 1 || d > 30) ){
                     System.out.println("Digite um dia entre 1 e 30.");
                    } 
                 }
       
                    if( m == 2 && bissexto == true && (d >= 1 && d <= 29) ){
                        this.dia = d;
                     } else{
                        if(m == 2 && bissexto == true && (d < 1 || d > 29) ){
                            System.out.println("Digite um dia entre 1 e 29.");
                         }
                       }
                      if(m == 2 && bissexto == false && (d >= 1 && d <= 28) ){
                        this.dia = d;
                      } else{
                          if(m == 2 && bissexto == false && (d < 1 || d > 28) ){
                            System.out.println("Digite um dia entre 1 e 28.");
                          }
                        }
     } else{
         System.out.println("Digite um mês entre 1 e 12.");     
    }        
 }
    
    public String getData(){
        String data = "Data: " +this.dia+ "/" +this.mes+ "/" +this.ano;
        return data;   
    }   
}
