package PPDCorba;


/**
* PPDCorba/PartRepositoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ppdPecas.idl
* sexta-feira, 19 de abril de 2019 00:04:39 Horário Padrão de Brasília
*/


//
public interface PartRepositoryOperations 
{

  //
  String name ();

  // nome do repositorio
  int numParts ();

  //
  PPDCorba.Part addPart (String name, String description);

  //
  PPDCorba.Part getPart (String code) throws PPDCorba.NoSuchPart;
  PPDCorba.PartInfo getPartInfo (String code) throws PPDCorba.NoSuchPart;

  //
  PPDCorba.PartListItem[] getPartList ();
} // interface PartRepositoryOperations
