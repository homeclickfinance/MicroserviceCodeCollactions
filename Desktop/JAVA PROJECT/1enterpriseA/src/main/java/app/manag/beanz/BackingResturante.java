/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package app.manag.beanz;

import entity.enterprise.Restruante;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.ArrayList;

import java.util.List; 
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author homec
 */


//@Named(value="viewresturiant")
//@RequestScoped


/*
public class BackingResturante {  
    
    Logger log = LogManager.getRootLogger();
    
   // private List<ResturanteBeans> resturanteList;
    private List<Restruante> resturants;
  
    
    public List<Restruante> getResturanteBeanes(){
        
     resturants = new ArrayList<>();
     
     resturants.add(new Restruante(2,"tRigh11","ttoll","sgola","ssetta","stiible"));
     resturants.add(new Restruante(13,"coop","nut","glory","goop","lkexx")); 
     resturants.add(new Restruante(1,"lest","oest","fest","shest","yot"));
     resturants.add(new Restruante(3,"esmt","hhst","ppest","dshest","rtoot"));
     resturants.add(new Restruante(4,"aaest","wwest","rtest","vhest","ggoot"));
     resturants.add(new Restruante(5,"ddest","bbest","bnest","jhest","oioot"));
        
     log.info("====================================Asign Resturante Control========================================");  
        
    return resturants;       
                
    }
    
    

    public void setResturants(List<Restruante> resturants) {
        this.resturants = resturants;
    }

    public List<Restruante> getResturants() {
        return resturants;
    }
    
    
    
    
    public List<Restruante> getResturant(int size) {

        if (size > resturants.size()) {
            Random rand = new Random();

            List<Restruante> randomList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int randomIndex = rand.nextInt(resturants.size());
                randomList.add(resturants.get(randomIndex));
            }

            return randomList;
        }

        else {
            return new ArrayList<>(resturants.subList(0, size));
        }

    }
     
    
    public List<Restruante> getResturanteBeanes(int size){
        
               List<Restruante> results = new ArrayList<>();
               List<Restruante> originals = getResturant(size);
               
                for (Restruante originalv : originals)
                {
                 results.add(originalv);
                }
             
        
                //for ( restruante : results) {
                   // ResturanteBeans.setCode(UUID.randomUUID().toString().replace("-", "").substring(0, 8));
                //}

                return results;
                
    }
    
    
    
          
}

*/
