import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by admin on 5/13/14 AD.
 */
public class main {
    public ArrayList<ConceptStucture> getStuctureList() {
        return StuctureList;
    }

    public void setStuctureList(ArrayList<ConceptStucture> stuctureList) {
        StuctureList = stuctureList;
    }


    ArrayList<ConceptStucture> StuctureList = new ArrayList<ConceptStucture>();

ArrayList<String> SuperStucure = new ArrayList<String>();

    public ArrayList<String> getSuperStucure() {
        return SuperStucure;
    }

    public void setSuperStucure(ArrayList<String> superStucure) {
        SuperStucure = superStucure;
    }

    public  static void main(String[] args) {


main main = new main();
Mapping mapping=new Mapping();
Rendering rendering = new Rendering();

 main.manageClass();

main.setSuperStucure(main.getSuperStucture());
  //      String m1= "aqwe";
//System.out.print(m1.split("a")[1]);
for(int i =0;i<main.getStuctureList().size();i++){
 main.getStuctureList().get(i).setExtend(main.getSuperStucure().get(i));


}
        ArrayList<ConceptStucture> m = new ArrayList<ConceptStucture>();

     for(int i =0;i<main.getStuctureList().size();i++){
       //  System.out.print(main.getStuctureList().get(i).getName());

      rendering.construct(main.getStuctureList().get(i));


     }
        rendering.Templeplate(main.getStuctureList());




    }



    public  ArrayList<ConceptStucture>  manageClass(){
        Mapping mapping = new Mapping();

        ConceptStucture stucture = null;
        HashMap<Integer,String> superclass= new HashMap<Integer, String>();
        ArrayList<ConceptProprety> propretyArrayList= new ArrayList<ConceptProprety>();
        ConceptProprety conceptProprety ;
        String proprety="";
        int space =0;
        int num=0;
        String name=null;
       // String getnumber[][] = new String[1][2];
        mapping.readFile();

        for(int i=getBetweenNum()[0][0];i<=getBetweenNum()[0][1];){

            if(CheckStucture(mapping.getRead().get(i),space)||i==getBetweenNum()[0][1]){
                if(num%2==0){
                    name = mapping.getNameStucture(mapping.getRead().get(i).trim());
                    superclass.put(space,name);
                    space = space +2;
                    i =i+1;
                    num = num +1;
                    System.out.println(name);
                    continue;

                }
                if(num%2==1){

                    stucture  = new ConceptStucture(name,superclass.get(space-2),null,propretyArrayList);
                    this.StuctureList.add(stucture);
                    propretyArrayList = new ArrayList<ConceptProprety>();
                    num = num +1;
                    continue;
                }
            }
            if(CkeckProprety(mapping.getRead().get(i),space)){
                   proprety = mapping.getProprety(mapping.getRead().get(i).trim());

                String getnumber[][] = new String[1][2];
                   int fullstop=0;
                for(int p=0;p<proprety.split(",")[0].length();p++){
                    String keep = proprety.split(",")[0].charAt(p) +"";
                    if(keep.equals(".")){
                        fullstop = fullstop +1;
                    }

                }
                if(fullstop==0){

                    getnumber[0][0] = "0";
                    getnumber[0][1] =  proprety.split(",")[0].split("\\.")[0];
                }
                if(fullstop==1){

                    getnumber[0][0] = "1";
                    getnumber[0][1] =  proprety.split(",")[0].split("\\.")[1];

                }
                if(fullstop==2){

                    getnumber[0][0] = "2";
                    getnumber[0][1] =  proprety.split(",")[0].split("\\.")[0];
                    System.out.print(proprety);
                }
                String score = null;
                String start = null;
                if(!proprety.split(",")[2].equals("null")){

                  score = proprety.split(",")[2];

                }
                if(!proprety.split(",")[4].equals("null")){
                 start = proprety.split(",")[4];

               }

                    conceptProprety = new ConceptProprety(getnumber,proprety.split(",")[1],score,proprety.split(",")[3],start);
                    propretyArrayList.add(conceptProprety);

                    i= i+1;
                    continue;

            }




            space=space-2;






        }
                            return null;
    }


    public  ArrayList<String> getSuperStucture(){
        Mapping mapping = new Mapping();
        mapping.readFile();
        HashMap<Integer,String> superclass= new HashMap<Integer, String>();
        int space =0;
        String name=null;
        ArrayList<String> arrayList = new ArrayList<String>();

        for(int i=getBetweenNum()[0][0];i<=getBetweenNum()[0][1];){
        if(CheckStucture(mapping.getRead().get(i),space)||i==getBetweenNum()[0][1]){
                if(space<=2){
                    name = mapping.getNameStucture(mapping.getRead().get(i).trim());

                    arrayList.add(superclass.get(space - 2));


                    superclass.put(space, name);

                    i=i+1;
                    space = space +2;
                    continue;
                }
                if(space>2){
                    name = mapping.getNameStucture(mapping.getRead().get(i).trim());
                    superclass.put(space,name);
                   arrayList.add(superclass.get(space - 2));
                    i=i+1;
                    space = space +2;
                   // num= num+1;
                    continue;
                }


        }
        if(CkeckProprety(mapping.getRead().get(i),space)){
            i=i+1;
            continue;


        }

        space= space-2;
        }



        return arrayList;


    }









    public boolean CheckStucture(String read,int space){
        boolean ckeck =false ;
        String tospace="";
        String data = "";
        String superclass="";
        Mapping cutOntology = new Mapping();

        for(int y=0;y<space;y++){

            tospace = tospace +" ";

        }
        for(int x=0;x< read.length();x++){
            data = data+ read.charAt(x);

            if(data.equals(tospace+"-")){
                superclass = cutOntology.getNameStucture(read.trim());

                ckeck= true;

            }




        }

        return ckeck;

    }
    public boolean CkeckProprety(String read,int space){

        boolean ckeck =false ;
        String tospace="";
        String data = "";
        String part="";
        Mapping mapping = new Mapping();

        for(int y=0;y<space;y++){

            tospace = tospace +" ";

        }
        for(int x=0;x< read.length();x++){
            data = data+ read.charAt(x);

            if(data.equals(tospace+"p/o")){
                part = mapping.getProprety(read.trim());

                ckeck= true;

            }
            if(data.equals(tospace+"a/o")){
                part = mapping.getProprety(read.trim());

                ckeck= true;

            }



        }

        return ckeck;



    }









    public int [][] getBetweenNum(){
        Mapping mapping = new Mapping();
        mapping.readFile();
        int [][] between = new int[1][2];
        for(int i=0;i<mapping.getRead().size();i++){
            if(mapping.getRead().get(i).equals("(Wholeness Concept)"))
            {

                between[0][0]= i+1;




            }
            if(mapping.getRead().get(i).equals("(Relation Concept)")){
                between[0][1]= i-1;




            }



        }
        return between;


    }








}