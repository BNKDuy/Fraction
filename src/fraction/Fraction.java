package fraction;

public class Fraction
{
  private static int count = 0; 
  private int num;
  private int deno;
  
  public Fraction()
  {
    num = 1;
    deno = 1;
    count++;
  }
  
  public Fraction(int n, int d)
  {
    if (n > 0) num = n;
    else num = 1;
    
    if (d > 0) deno = d;
    else deno = 1;
    
    count++;
  }
  
  public int getNumerator()
  {
    return num;
  }
  
  public int getDenominator()
  {
    return deno;
  }
  
  public static int getNumFractions()
  {
    return count;
  }
  
  public String toString()
  {
    return ((num) + "/" + (deno)); 
  }
  
  public String mixedNumber()
  {
    if (num/deno != 0 && num%deno != 0) return num/deno + " " + num%deno + "/" + deno;
    else if (num/deno != 0 && num%deno == 0) return Integer.toString(num/deno);
    else return num  + "/" + deno;
  }

  public void setNumerator (int n)
  {
    if (n > 0)
    {
      num = n;
      count++;
    }
  }
  
  public void setDenominator(int d)
  {
    if (d > 0)
    {
      deno = d;
      count++;
    }
  }
  
  public void add(int n, int d)
  {
    if (n > 0 && d > 0)
    {
      num = num * d + deno * n;
      deno *= d;
      count++;
    }
  }
  
  public void add(Fraction other)
  {
    if (other.getNumerator() > 0 && other.getDenominator() > 0)
    {
      num = num * other.getDenominator() + deno * other.getNumerator();
      deno *= other.getDenominator();
      count++;
    }
  }
  
  public void multiply(int n, int d)
  {
    if (n > 0 && d > 0)
    {
      num *= n;
      deno *= d;
      count++;
    }
  }
  
  public void multiply(Fraction other)
  {
    if (other.getNumerator() > 0 && other.getDenominator() > 0)
    {
      num *= other.getNumerator();
      deno *= other.getDenominator();
      count++;
    }
  }
}

