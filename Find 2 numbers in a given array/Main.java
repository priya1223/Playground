#include<stdio.h>
int main()
{
  int i,n,b=-1,c=-1,d,g;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
 {
    scanf("%d",&a[i]);
}
  scanf("%d%d",&d,&g);
  for(i=0;i<n;i++)
  {
    if(d==a[i] && b==-1)
    {
      b=i;
    }
    if(g==a[i] && c==-1)
    {
      c=i;
    }
  }
  printf("Element 1 index = %d\nElement 2 index = %d",b,c);
}
