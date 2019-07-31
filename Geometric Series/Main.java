#include<stdio.h>
int main()
{
  int n,k,a,d,f;
  scanf("%d",&n);
    if(n%2 == 1)
    {
      a=(n+1)/2;
      k=1*pow(2,a-1);
      printf("%d",k);
    }
  else
  {
    d=n/2;
    k=1*pow(3,d-1);
     printf("%d",k);
  }
  return 0;
}