package utility;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElementRefs;


@XmlRootElement
public class Genus {

    String name;
    String habitat;
    ArrayList<Species> generaSpecies = new ArrayList<Species>();

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
    
    public String getHabitat() {
        return habitat;
    }
    
    @XmlElement
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public ArrayList<Species> getSpecies() {
        return generaSpecies;
    }
    
    @XmlElementRef
    public void setSpecies(Species pokemon) {
        this.generaSpecies.add(pokemon);
    }
    
    public void removeSpecies(Species pokemon) {
    	this.generaSpecies.remove(pokemon);
    }
    
    public class Species {

        String name;
        String egg_group;
        String genus;
        Species evolvesFrom;
        Species evolvesTo;

        public String getName() {
            return name;
        }

        @XmlElement
        public void setName(String name) {
            this.name = name;
        }
        
        public String getEggGroup() {
            return egg_group;
        }
        
        @XmlElement
        public void setEggGroup(String egg) {
            this.egg_group = egg;
        }
        
        public String getGenus() {
            return genus;
        }
        
        @XmlElement
        public void setGenus(String genus) {
            this.genus = genus;
        }
        
        public void setEvolvesFrom(Species pokemon) {
        	this.evolvesFrom = pokemon;
        }
        
        @XmlElementRef
        public Species getEvolvesFrom() {
        	return this.evolvesFrom;
        }
        
        public void setEvolvesTo(Species pokemon) {
        	this.evolvesTo = pokemon;
        }
        
        @XmlElementRef
        public Species getEvolvesTo() {
        	return this.evolvesTo;
        }
    }   
    
}
