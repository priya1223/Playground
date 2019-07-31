#include<stdio.h>
int main()
{
	int a=0,n,x,d,c,r,h;
  scanf("%d",&n);
	if(n%2==1)
    {
      d=2;
      x=(n+1)/2;
     c=a+(x-1)*d;
     printf("%d",c);
    }
  else
  {
    d=1;
    r=n/2;
    h=a+(r-1)*d;
    printf("%d",h);
  }
}