package PPDCorba;

/**
* PPDCorba/PartInfoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ppdPecas.idl
* sexta-feira, 19 de abril de 2019 00:04:39 Horário Padrão de Brasília
*/

public final class PartInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public PPDCorba.PartInfo value = null;

  public PartInfoHolder ()
  {
  }

  public PartInfoHolder (PPDCorba.PartInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PPDCorba.PartInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PPDCorba.PartInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PPDCorba.PartInfoHelper.type ();
  }

}
