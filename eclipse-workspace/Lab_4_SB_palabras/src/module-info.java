package poo_08_clase_math;

/**
 *
 * @author WILMER
 */
    /**
     * @param args the command line arguments
     */
    Public static void main(String[] args) {
   
int generados=0;
int[] nums=new int[6];
int n;
do {
     //genramos un numero aleatorio entre 1 a 49
n=(int) (Math.random()*49+1);
// si no está repetido, lo guardamos en el array
if(!repetido(n,nums, generados)){ 
nums[generados]=n;
generados++;

} while(generados<6);// TODO code application logic here
    ordenar(nums);
    mostrar(nums);
    }
private static boolean repetido(int n, int[] nums, int generados){
boolean res  = false;
for(int i=0; i<generados; i++){
if(n==nums[i]){
res=true;
break;
}
}
return res;
}
private static void ordenar(int[]nums){
    int aux;
    for(int i=0;i<nums.length;i++)
        for(int k=i;k<nums.length;k++){
            aux=nums[i];
            nums[i]=nums[k];
            nums[k]=aux;
                    }
}
private static void mostrar(int[]nums){
 
    for(int num:nums)
        System.out.print(num+",");
}
}