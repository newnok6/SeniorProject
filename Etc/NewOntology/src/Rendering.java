import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by admin on 5/1/14 AD.
 */
public class Rendering {
    ArrayList<ConceptStucture> conceptStuctureArrayList= new ArrayList<ConceptStucture>();





    public void construct(ConceptStucture stucture){
     ArrayList<ConceptProprety> propretyArrayList = new ArrayList<ConceptProprety>();

     String number[][] =new String[1][2];
     ConceptProprety conceptProprety ;

try {
    File file = new File("src/Ontology/"+stucture.getName()+".java");

    if (!file.exists()) {

        file.createNewFile();
    }
    else{
        deleteClass(stucture.getName());
        stucture.getAttributeArrayList().addAll(SeachStucture(stucture.getName()).getAttributeArrayList());

    }
    FileWriter fw = new FileWriter(file.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write("package Ontology;");
    bw.newLine();
    bw.write("import java.util.ArrayList;");bw.newLine();
    bw.newLine();
    bw.write("import java.sql.Time;");
    bw.newLine();
    if(stucture.getExtend()!=null){
    bw.write("public class "+stucture.getName()+" extends "+stucture.getExtend()+"");
    }
    else{
    bw.write("public class "+stucture.getName());
    }
    bw.newLine();
    bw.write("{");
    bw.newLine();
    for(int i =0;i<stucture.getAttributeArrayList().size();i++){
       if(stucture.getAttributeArrayList().get(i).getScope()==null){
           if(stucture.getAttributeArrayList().get(i).getNumber()[0][0].equals("0")){
               bw.write(NormalProprety(stucture.getAttributeArrayList().get(i).getName(),stucture.getAttributeArrayList().get(i).getType(),stucture.getAttributeArrayList().get(i).getStart()));
               bw.newLine();
           }
           if(stucture.getAttributeArrayList().get(i).getNumber()[0][0].equals("1")){
               bw.write(ArrayProprety(stucture.getAttributeArrayList().get(i).getName(),stucture.getAttributeArrayList().get(i).getType(),stucture.getAttributeArrayList().get(i).getNumber()[0][1]));
               bw.newLine();
           }
           if(stucture.getAttributeArrayList().get(i).getNumber()[0][0].equals("2")){
              bw.write(ArrayListProprety(stucture.getAttributeArrayList().get(i).getName(), stucture.getAttributeArrayList().get(i).getType()));
              bw.newLine();
           }


       }
      else{
           if(stucture.getAttributeArrayList().get(i).getNumber()[0][0].equals("0")){
               number[0][0]="0";
               conceptProprety = new ConceptProprety(number,stucture.getAttributeArrayList().get(i).getType(),null,stucture.getAttributeArrayList().get(i).getType(),null);
               propretyArrayList.add(conceptProprety);
               conceptProprety = new ConceptProprety(number,stucture.getAttributeArrayList().get(i).getName(),null,stucture.getAttributeArrayList().get(i).getName(),null);
               propretyArrayList.add(conceptProprety);
               ConceptStucture conceptStucture = new ConceptStucture(stucture.getAttributeArrayList().get(i).getScope(),null,null,propretyArrayList);
               this.conceptStuctureArrayList.add(conceptStucture);
               construct(conceptStucture);
               propretyArrayList = new ArrayList<ConceptProprety>();
               bw.write(NormalProprety(stucture.getAttributeArrayList().get(i).getName(),stucture.getAttributeArrayList().get(i).getScope(),stucture.getAttributeArrayList().get(i).getStart()));
               bw.newLine();


           }
           if(stucture.getAttributeArrayList().get(i).getNumber()[0][0].equals("1")){
               number[0][0]="0";
               conceptProprety = new ConceptProprety(number,stucture.getAttributeArrayList().get(i).getType(),null,stucture.getAttributeArrayList().get(i).getType(),null);
               propretyArrayList.add(conceptProprety);
               conceptProprety = new ConceptProprety(number,stucture.getAttributeArrayList().get(i).getName(),null,stucture.getAttributeArrayList().get(i).getName(),null);
               propretyArrayList.add(conceptProprety);
               ConceptStucture conceptStucture = new ConceptStucture(stucture.getAttributeArrayList().get(i).getScope(),null,null,propretyArrayList);
               this.conceptStuctureArrayList.add(conceptStucture);
               construct(conceptStucture);
               propretyArrayList = new ArrayList<ConceptProprety>();
               bw.write(ArrayProprety(stucture.getAttributeArrayList().get(i).getName(),stucture.getAttributeArrayList().get(i).getScope(),stucture.getAttributeArrayList().get(i).getNumber()[0][1]));
               bw.newLine();
           }
           if(stucture.getAttributeArrayList().get(i).getNumber()[0][0].equals("2")){
               number[0][0]="0";
               conceptProprety = new ConceptProprety(number,stucture.getAttributeArrayList().get(i).getType(),null,stucture.getAttributeArrayList().get(i).getType(),null);
               propretyArrayList.add(conceptProprety);
               conceptProprety = new ConceptProprety(number,stucture.getAttributeArrayList().get(i).getName(),null,stucture.getAttributeArrayList().get(i).getName(),null);
               propretyArrayList.add(conceptProprety);
               ConceptStucture conceptStucture = new ConceptStucture(stucture.getAttributeArrayList().get(i).getScope(),null,null,propretyArrayList);
               this.conceptStuctureArrayList.add(conceptStucture);
               construct(conceptStucture);
               propretyArrayList = new ArrayList<ConceptProprety>();
               bw.write(ArrayListProprety(stucture.getAttributeArrayList().get(i).getName(),stucture.getAttributeArrayList().get(i).getScope()));
               bw.newLine();
           }
           number[0][0]="0";

       }

    }


    for(int i =0;i<stucture.getAttributeArrayList().size();i++){
        if(stucture.getAttributeArrayList().get(i).getScope()==null){
            if(stucture.getAttributeArrayList().get(i).getNumber()[0][0].equals("0")){
                bw.write("public "+chagetoType(stucture.getAttributeArrayList().get(i).getType())+"  get"+chagetoBeen(stucture.getAttributeArrayList().get(i).getName())+"()");
                bw.newLine();
                bw.write("{");
                bw.newLine();
                bw.write("return this." + stucture.getAttributeArrayList().get(i).getName().toLowerCase() + ";");
                bw.newLine();
                bw.write("}");
                bw.write("public void set"+chagetoBeen(stucture.getAttributeArrayList().get(i).getName())+" "+"( "+chagetoType(stucture.getAttributeArrayList().get(i).getType())+" "+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+")");
                bw.newLine();
                bw.write("{");
                bw.newLine();
                bw.write("this."+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+" = "+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+";");
                bw.newLine();
                bw.write("}");
                bw.newLine();
            }
            if(stucture.getAttributeArrayList().get(i).getNumber()[0][0].equals("1")){
                bw.write("public "+chagetoType(stucture.getAttributeArrayList().get(i).getType())+"[]"+"  get"+chagetoBeen(stucture.getAttributeArrayList().get(i).getName())+"()");
                bw.newLine();
                bw.write("{");
                bw.newLine();
                bw.write("return this."+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+";");
                bw.newLine();
                bw.write("}");
                bw.write("public void set"+chagetoBeen(stucture.getAttributeArrayList().get(i).getName())+" "+"( "+chagetoType(stucture.getAttributeArrayList().get(i).getType())+" [] "+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+")");
                bw.newLine();
                bw.write("{");
                bw.write("this."+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+" = "+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+";");
                bw.newLine();
                bw.write("}");
                bw.newLine();
            }
            if(stucture.getAttributeArrayList().get(i).getNumber()[0][0].equals("2")){
                bw.write("public ArrayList<"+chagetoType(stucture.getAttributeArrayList().get(i).getType())+"> get"+chagetoBeen(stucture.getAttributeArrayList().get(i).getName())+"()");
                bw.newLine();
                bw.write("{");
                bw.newLine();
                bw.write("return this."+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+";");
                bw.newLine();
                bw.write("}");
                bw.newLine();
                bw.write("public void "+"get"+chagetoBeen(stucture.getAttributeArrayList().get(i).getName())+"( ArrayList<"+chagetoType(stucture.getAttributeArrayList().get(i).getType())+"> "+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+")");
                bw.newLine();
                bw.write("{");
                bw.newLine();
                bw.write("this."+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+" = "+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+";");
                bw.write("}");
                bw.newLine();


            }

        }
        else{
            if(stucture.getAttributeArrayList().get(i).getNumber()[0][0].equals("0")){
                bw.write("public "+stucture.getAttributeArrayList().get(i).getScope()+"  get"+chagetoBeen(stucture.getAttributeArrayList().get(i).getName())+"()");
                bw.newLine();
                bw.write("{");
                bw.newLine();
                bw.write("return this." + stucture.getAttributeArrayList().get(i).getName().toLowerCase() + ";");
                bw.newLine();
                bw.write("}");
                bw.write("public void set"+chagetoBeen(stucture.getAttributeArrayList().get(i).getName())+" "+"( "+stucture.getAttributeArrayList().get(i).getScope()+" "+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+")");
                bw.newLine();
                bw.write("{");
                bw.newLine();
                bw.write("this."+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+" = "+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+";");
                bw.newLine();
                bw.write("}");
                bw.newLine();

            }
            if(stucture.getAttributeArrayList().get(i).getNumber()[0][0].equals("1")){
                bw.write("public "+stucture.getAttributeArrayList().get(i).getScope()+"[]"+"  get"+chagetoBeen(stucture.getAttributeArrayList().get(i).getName())+"()");
                bw.newLine();
                bw.write("{");
                bw.newLine();
                bw.write("return this."+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+";");
                bw.newLine();
                bw.write("}");
                bw.write("public void set"+chagetoBeen(stucture.getAttributeArrayList().get(i).getName())+" "+"( "+stucture.getAttributeArrayList().get(i).getScope()+" [] "+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+")");
                bw.newLine();
                bw.write("{");
                bw.write("this."+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+" = "+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+";");
                bw.newLine();
                bw.write("}");
                bw.newLine();
            }
            if(stucture.getAttributeArrayList().get(i).getNumber()[0][0].equals("2")){
                bw.write("public ArrayList<"+stucture.getAttributeArrayList().get(i).getScope()+"> get"+chagetoBeen(stucture.getAttributeArrayList().get(i).getName())+"()");
                bw.newLine();
                bw.write("{");
                bw.newLine();
                bw.write("return this."+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+";");
                bw.newLine();
                bw.write("}");
                bw.newLine();
                bw.write("public void "+"set"+chagetoBeen(stucture.getAttributeArrayList().get(i).getName())+"( ArrayList<"+stucture.getAttributeArrayList().get(i).getScope()+"> "+stucture.getAttributeArrayList().get(i).getName()+")");
                bw.newLine();
                bw.write("{");
                bw.newLine();
                bw.write("this."+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+" = "+stucture.getAttributeArrayList().get(i).getName().toLowerCase()+";");
                bw.write("}");
                bw.newLine();
            }

        }
bw.newLine();
    }
bw.write("}");
bw.close();


}



        catch (IOException e) {
            e.printStackTrace();


        }

    }
    public void Templeplate(ArrayList<ConceptStucture> stuctureArrayList){
        try {


            File file = new File("Templates.clp");


            if (!file.exists()) {

                file.createNewFile();
            }
            stuctureArrayList.addAll(this.conceptStuctureArrayList);
           // System.out.print(this.conceptStuctureArrayList.get(0).getName());
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            ConceptStucture stucture;
            for(int i=0;i<stuctureArrayList.size();i++){
                stucture = stuctureArrayList.get(i);

                if(stucture.getExtend()!=null){
                    bw.write("(deftemplate "+stucture.getName() +" extends "+stucture.getExtend() );
                    bw.newLine();
                }
                else{

                    bw.write("(deftemplate "+stucture.getName());
                    bw.newLine();
                }
                for(int x =0;x<stucture.getAttributeArrayList().size();x++){
                    if(stucture.getAttributeArrayList().get(x).getNumber()[0][0].equals("0")){
                    bw.write("    (slot "+stucture.getAttributeArrayList().get(x).getName());
                    bw.newLine();
                    bw.write("        (type "+propretyOftemple(stucture.getAttributeArrayList().get(x).getType())+"))");
                    bw.newLine();
                    }
                    else{
                    bw.write("    (multislot "+stucture.getAttributeArrayList().get(x).getName()+")");
                    bw.newLine();
                    }
                    //bw.newLine();

                }
                bw.write(")");
                    bw.newLine();
            }

                    bw.close();
        }
            catch (IOException e) {
                e.printStackTrace();
            }



    }

    public ConceptStucture SeachStucture(String name){
        main main = new main();
        String checkName;
        for(int i=0;i<main.getStuctureList().size();i++){
          checkName =main.getStuctureList().get(i).getName();
            if(checkName.equals(name)){
                return main.getStuctureList().get(i);

            }

        }

        return null;
    }

    public boolean deleteClass(String name) {
        try{

            File file = new File("src/Ontology/"+name+".java");

            if(file.delete()){


                return true;

            }else{

                return false;
            }

        }catch(Exception e){

            e.printStackTrace();
            return false;
        }
    }


    public String chagetoBeen(String name){
        String keep="";
        if(name.toLowerCase().equals("valueproperty")){
            return "Value";
        }

        else {
        for(int i=1;i<name.length();i++){
            keep = keep +name.charAt(i);

        }
        name = name.charAt(0)+"";
         return name.toUpperCase()+keep.toLowerCase();

        }


    }

    public String chagetoType(String data){
        if(data.equals("string")){

            data = "String";

        }
        if(data.equals("integer")){

            data ="int";

        }

        if(data.equals("decimal")){

            data = "DecimalFormat";

        }
        if(data.equals("float")){

            data = "float";
        }
        if(data.equals("date")){

            data = "Date";

        }
        if(data.equals("time")){

            data ="Time";

        }
        return data;

    }
    public String propretyOftemple(String data){
        String [] type = {"string","integer","decimal","float","date","time"};
       for(int i=0;i<type.length;i++){
           if(data.equals(type[i])){
               return data.toUpperCase();
           }

       }

        return "OBJECT";
    }
    public String NormalProprety(String name,String type,String start){
        if(start!=null){
         if(type.equals("float")){
             return chagetoType(type)+"  "+name.toLowerCase()+" = "+start+"f;";
         }
         if(type.equals("date")){
             return chagetoType(type)+"  "+name.toLowerCase()+" = "+start+"f;";
         }
         if(type.equals("time")){
             return chagetoType(type)+"  "+name.toLowerCase()+" = "+start+"f;";
         }
         if(chagetoType(type).equals(type))   {

            return chagetoType(type)+"  "+name.toLowerCase()+" = "+start+";";
        }
        return chagetoType(type)+"  "+name.toLowerCase()+" = "+start+";";
         }

        else {
        return chagetoType(type)+"  "+name.toLowerCase()+";";
        }

    }
    public String ArrayProprety(String name,String type,String number){
    return chagetoType(type)+" "+name.toLowerCase()+"[] = new "+chagetoType(type)+"["+number+"];";


}

    public String ArrayListProprety(String name,String type){

        return "ArrayList<"+chagetoType(type)+">  " +name.toLowerCase()+ " = new ArrayList<"+chagetoType(type)+">();";

    }






}