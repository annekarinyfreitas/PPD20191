package PPDCorba;


/**
* PPDCorba/_PartRepositoryStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ppdPecas.idl
* sexta-feira, 19 de abril de 2019 00:04:39 Horário Padrão de Brasília
*/


//
public class _PartRepositoryStub extends org.omg.CORBA.portable.ObjectImpl implements PPDCorba.PartRepository
{


  //
  public String name ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_name", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return name (        );
            } finally {
                _releaseReply ($in);
            }
  } // name


  // nome do repositorio
  public int numParts ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_numParts", true);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return numParts (        );
            } finally {
                _releaseReply ($in);
            }
  } // numParts


  //
  public PPDCorba.Part addPart (String name, String description)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("addPart", true);
                $out.write_string (name);
                $out.write_string (description);
                $in = _invoke ($out);
                PPDCorba.Part $result = PPDCorba.PartHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return addPart (name, description        );
            } finally {
                _releaseReply ($in);
            }
  } // addPart


  //
  public PPDCorba.Part getPart (String code) throws PPDCorba.NoSuchPart
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getPart", true);
                $out.write_string (code);
                $in = _invoke ($out);
                PPDCorba.Part $result = PPDCorba.PartHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:PPDCorba/NoSuchPart:1.0"))
                    throw PPDCorba.NoSuchPartHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getPart (code        );
            } finally {
                _releaseReply ($in);
            }
  } // getPart

  public PPDCorba.PartInfo getPartInfo (String code) throws PPDCorba.NoSuchPart
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getPartInfo", true);
                $out.write_string (code);
                $in = _invoke ($out);
                PPDCorba.PartInfo $result = PPDCorba.PartInfoHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:PPDCorba/NoSuchPart:1.0"))
                    throw PPDCorba.NoSuchPartHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getPartInfo (code        );
            } finally {
                _releaseReply ($in);
            }
  } // getPartInfo


  //
  public PPDCorba.PartListItem[] getPartList ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getPartList", true);
                $in = _invoke ($out);
                PPDCorba.PartListItem $result[] = PPDCorba.PartListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getPartList (        );
            } finally {
                _releaseReply ($in);
            }
  } // getPartList

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:PPDCorba/PartRepository:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _PartRepositoryStub