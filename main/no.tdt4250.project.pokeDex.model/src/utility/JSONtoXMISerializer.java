package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import utility.Genus.Species;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JSONtoXMISerializer {
	public JSONtoXMISerializer() {
		
		
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException 
	{
	    //JSON parser object to parse read file
	    JSONParser jsonParser = new JSONParser();
	     
	    try (FileReader reader = new FileReader("pokemons.json"))
	    {
	        //Read JSON file
	        Object obj  = jsonParser.parse(reader);
	        JSONArray pokemonList = (JSONArray) new JSONParser().parse((String) obj);
	        
	        pokemonList.forEach(pokemon -> parsePokemonObject((JSONObject) pokemon));
	        
	    
	         /*
	        //Iterate over employee array
	        pokemonList.forEach( pokemon -> parsePokemonObject( (JSONObject) pokemon ) );
			*/
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	    ConvertToXMI();
	}

	//TODO: refactor to get all attributes of pokemon
	private static void parsePokemonObject(JSONObject pokemon) 
	{	     
	    //Get Pokemon name
	    String name = (String) pokemon.get("name"); 
	    name = name.substring(0, 1).toUpperCase() + name.substring(1);
	    System.out.println(name);
	    
	    //Get Pokemon genus
	    JSONArray genera = (JSONArray) pokemon.get("genera");
	    String genus = (String) ((JSONObject) genera.get(2)).get("genus");    
	    System.out.println(genus);
	    
	  //Get Pokemon egg_group
	    String egg_group =  ((JSONObject) ((JSONArray) pokemon.get("egg_groups")).get(0)).get("name").toString();  
	    System.out.println(egg_group);
	}
	
	private static void ConvertToXMI() throws IOException {
		String fileSeparator = System.getProperty("file.separator");
		try {
			 // Seed Pokemon Genus
			 Genus seedPokemon = new Genus();
			 seedPokemon.setName("Seed Pokemon");
			 seedPokemon.setHabitat("Grass");
			
			// Bulba
			Species bulb = seedPokemon.new Species();
			bulb.setName("Bulbasaur");
			bulb.setEggGroup("plant");
			bulb.setGenus("Seed Pokemon");
		    
		    //Ivy
		    Species ivy = seedPokemon.new Species();
		    ivy.setName("Ivysaur");
		    ivy.setEggGroup("plant");
		    ivy.setGenus("Seed Pokemon");
		    
		    //Venu
		    Species venu = seedPokemon.new Species();
		    venu.setName("Bulbasaur");
		    venu.setEggGroup("plant");
		    venu.setGenus("Seed Pokemon");
		    
		    bulb.setEvolvesTo(ivy);
		    ivy.setEvolvesTo(venu);
		    seedPokemon.setSpecies(bulb);
		    seedPokemon.setSpecies(ivy);
		    seedPokemon.setSpecies(venu);
		    
	
		 
		 			
	        File file = new File("src-gen" + fileSeparator + "file.xmi");
	        JAXBContext jaxbContext = JAXBContext.newInstance(Genus.class);
	        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

	        // output pretty printed
	        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

	        jaxbMarshaller.marshal(seedPokemon, file);

	        jaxbMarshaller.marshal(seedPokemon, System.out);
	        
	        String relativePath = "tmp" + fileSeparator + "file.xml";
	        if(file.createNewFile()){
	            System.out.println(relativePath+" File Created in Project root directory");
	        }else System.out.println("File "+relativePath+" already exists in the project root directory");
	    
	        

	          } catch (JAXBException e) {
	        e.printStackTrace();
	          }
		
	}
}

/*
<?xml version="1.0" encoding="UTF-8"?>
<no.tdt4250.project.pokeDex.model:Domain
    xmi:version="2.0"
    xmlns:xmi="http://www.omg.org/XMI"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:no.tdt4250.project.pokeDex.model="http://no/tdt4250/project/pokeDex/model"
    xsi:schemaLocation="http://no/tdt4250/project/pokeDex/model domain.ecore"
    name="Pokemons">
  <kingdoms>
    <phyla name="Angiospermophyta"/>
  </kingdoms>
  <kingdoms
      name="Animalia">
    <phyla name="Arthropods"/>
    <phyla>
      <classes/>
      <classes
          name="Fish"/>
      <classes
          name="Mammal">
        <genera
            name="Poison Pin"
            habitat="Grassland"
            sameAnatomy="//@kingdoms.1/@phyla.1/@classes.2/@genera.1"
            anatomy="Upright">
          <species
              name="Nidoran"
              evolvesTo="//@kingdoms.1/@phyla.1/@classes.2/@genera.0/@species.1"
              icon="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/32.png"/>
          <species
              name="Nidorino"
              evolvesTo="//@kingdoms.1/@phyla.1/@classes.2/@genera.0/@species.2"
              evolvesFrom="//@kingdoms.1/@phyla.1/@classes.2/@genera.0/@species.0"
              icon="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/33.png"/>
          <species
              name="Nidoking"
              evolvesFrom="//@kingdoms.1/@phyla.1/@classes.2/@genera.0/@species.1"
              icon="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/34.png"/>
        </genera>
        <genera
            name="Fairy Pokémon"
            sameAnatomy="//@kingdoms.1/@phyla.1/@classes.2/@genera.0"
            anatomy="Upright">
          <species
              name="Clefable"
              evolvesFrom="//@kingdoms.1/@phyla.1/@classes.2/@genera.1/@species.2"/>
          <species
              name="Cleffa"
              evolvesTo="//@kingdoms.1/@phyla.1/@classes.2/@genera.1/@species.2"/>
          <species
              name="Clefairy"
              evolvesTo="//@kingdoms.1/@phyla.1/@classes.2/@genera.1/@species.0"
              evolvesFrom="//@kingdoms.1/@phyla.1/@classes.2/@genera.1/@species.1"/>
        </genera>
      </classes>
    </phyla>
    <phyla name="Vertebrate"/>
  </kingdoms>
  <kingdoms
      name="Mineralia">
    <phyla name="Metamorphic"/>
  </kingdoms>
</no.tdt4250.project.pokeDex.model:Domain>
*/