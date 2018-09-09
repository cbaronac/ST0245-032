

/**
 * Solución ejercicios codingbat - Array3
 * 
 * @author (Camila Barona y Mariana Gomez) 
 * @version (2018)
 */
public class linearln
{
    public boolean linearIn(int[] outer, int[] inner) {
 
int k=0;
for(int i=0;i<outer.length&&k<inner.length;i++)
if(outer[i]==inner[k])
k++;

if(k==inner.length) 
return true;
else
return false;


}
}
