package PPDCorba;


/**
* PPDCorba/PartInfo.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ppdPecas.idl
* sexta-feira, 19 de abril de 2019 00:04:39 Horário Padrão de Brasília
*/

public final class PartInfo implements org.omg.CORBA.portable.IDLEntity
{
  public PPDCorba.Part part = null;

  // a pec'a
  public String code = null;

  // codigo da pec'a
  public String name = null;

  // nome da pec'a
  public String description = null;

  public PartInfo ()
  {
  } // ctor

  public PartInfo (PPDCorba.Part _part, String _code, String _name, String _description)
  {
    part = _part;
    code = _code;
    name = _name;
    description = _description;
  } // ctor

} // class PartInfo
