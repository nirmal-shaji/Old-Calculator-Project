#include <stdio.h>

int main(){
int a[]={4,6,3,4,8,5,2};
int i,j,temp,l,sum=0,flag;
l=sizeof a/sizeof a[0];


for(i=0;i<l;i++){
    flag=0;
for(j=2;j<=a[i];j++){
    if(a[i]%j==0){
        flag=1;
    }
}
   // sum=sum+a[i];
        if(flag==0){
         a[i]=a[i+1];
    } 
}

for(i=0;i<l;i++){
printf("%d",a[i]);
    }
//second largest number in array
// for(i=0;i<l;i++){
//     for(j=i+1;j<l;j++){
//     if(a[i]>a[j]){
//         temp = a[i];
//         a[i]=a[j];
//         a[j]= temp;
//       }
//     }
// }


// for(i=0;i<l;i++){

// printf(" %d",a[i]);
// }

// printf("\n%d",a[i-2]);



 return 0;


    }

   