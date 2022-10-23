# include<stdio.h>

int main(){    
 int i,j,a[100],n,sum=0 ,flag;
 printf( "enter a limit");

 scanf("%d",&n);
 for(i=0;i<n;i++){
    scanf("%d",&a[i]);
 } 
 for(i=0;i<n;i++){
    flag=0;
    for(j=2;j<=a[i]/2;j++){
    if(a[i]%j==0){
         flag=1;
    }
    }
         if(flag==0&&a[i]!=1){
    
    }
 }


}