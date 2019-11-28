package domain.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import domain.Domain;
import domain.DomainFactory;
import domain.Genus;
import domain.Kingdom;
import domain.Phylum;
import domain.Species;
import domain.Class;


/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see no.tdt4250.project.pokeDex.util.DomainResourceFactoryImpl
 * @generated NOT
 */

public class DomainResourceImpl extends XMIResourceImpl {
	JSONArray pokemonList;
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public DomainResourceImpl(URI uri) {
		super(uri);
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// SAVING TO XMI
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("domain", new DomainResourceFactoryImpl());
		Resource domainResource = resSet.createResource(URI.createURI("test.domain"));
		Domain domain = DomainFactory.eINSTANCE.createDomain();		
		
		
		// GLOBAL ARRAYS
		ArrayList<String> genera = new ArrayList<>();
		ArrayList<Genus> generaInstances = new ArrayList<>();
		
		// BUILD TREE STRUCTURE BOTTOM UP
		// GENERAL DOMAIN
		domain.setName("Pokemons");
		System.out.println(resSet);
		domainResource.getContents().add(domain);
		
		
		// BUILD ANIMALIA STRUCTURE
		
		// ADD KINGDOMS
		Kingdom animalia = DomainFactory.eINSTANCE.createKingdom();
		animalia.setName("Animalia");
		
		// ADD PHYLUM
		
		// GENERAL EGG_GROUP
		Phylum chordates = DomainFactory.eINSTANCE.createPhylum(); 
		chordates.setName("Chordates");
		animalia.getPhyla().add(chordates);

		
		// BUGS EGG GROUP
		Phylum arthropods = DomainFactory.eINSTANCE.createPhylum(); 
		arthropods.setName("Arthropods");
		animalia.getPhyla().add(arthropods);

		
		/*
		 * ADD CLASS FOR CHORDATES
		 */
		
		// EGG_GROUP == UNSPECIFIED
		Class mammalClass = DomainFactory.eINSTANCE.createClass();
		mammalClass.setName("Mammal");
		chordates.getClasses().add(mammalClass);
		
		// EGG_GROUP == FLYING
		Class birdClass = DomainFactory.eINSTANCE.createClass();
		birdClass.setName("Bird");
		chordates.getClasses().add(birdClass);
		
		// EGG_GROUP == WATER 1,2,3
		Class fishClass = DomainFactory.eINSTANCE.createClass();
		fishClass.setName("Fish");
		chordates.getClasses().add(fishClass);
		
		// EGG_GROUP == DRAGON
		Class reptileClass = DomainFactory.eINSTANCE.createClass();
		reptileClass.setName("Reptile");
		chordates.getClasses().add(reptileClass);
		
		// EGG_GROUP == FAIRY
		Class mythicalClass = DomainFactory.eINSTANCE.createClass();
		mythicalClass.setName("Mythical creature");
		chordates.getClasses().add(mythicalClass);
		
		/*
		 * CLASSES FOR ARTHROPODS
		 */
		
		Class generalArthropodsClass = DomainFactory.eINSTANCE.createClass();
		generalArthropodsClass.setName("UNSPECIFIED BUG CLASS");
		arthropods.getClasses().add(generalArthropodsClass);
		

		
		// BUILD PLANTAE STRUCTURE
		Kingdom plantae = DomainFactory.eINSTANCE.createKingdom();
		plantae.setName("Plantae");
		
		
		// ADD PHYLA FOR PLANTAE
		Phylum generalPhylumPlant = DomainFactory.eINSTANCE.createPhylum();
		generalPhylumPlant.setName("Unspecified Plantae phylum");
		plantae.getPhyla().add(generalPhylumPlant);
		
		// ADD CLASS FOR PHYLUM
		Class generalClassPlants = DomainFactory.eINSTANCE.createClass();
		generalClassPlants.setName("Unspecified plant class");
		generalPhylumPlant.getClasses().add(generalClassPlants);
		
		
		
		// BUILD MINERALIA STRUCTURE
		Kingdom mineralia = DomainFactory.eINSTANCE.createKingdom();
		mineralia.setName("Mineralia");	
		
		// ADD PHYLUM FOR MINERALIA
		Phylum generalPhylumMineral = DomainFactory.eINSTANCE.createPhylum();
		generalPhylumMineral.setName("Unspecified Mineralia phylum");
		mineralia.getPhyla().add(generalPhylumMineral);
		
		// ADD CLASS FOR PHYLUM
		Class generalClassMineral = DomainFactory.eINSTANCE.createClass();
		generalClassMineral.setName("Unspecified mineral class");
		generalPhylumMineral.getClasses().add(generalClassMineral);
				
				
		// ADD KINGDOMS TO DOMAIN
		domain.getKingdoms().add(plantae);
		domain.getKingdoms().add(animalia);
		domain.getKingdoms().add(mineralia);
		
		// READING AND PARSING JSON
		
		{
		    //JSON parser object to parse read file
		    JSONParser jsonParser = new JSONParser();
		     
		    try (FileReader reader = new FileReader("pokemons.json"))
		    {
		        //Read JSON file
		        Object obj  = jsonParser.parse(reader);
		        JSONArray pokemonList = (JSONArray) new JSONParser().parse((String) obj);
		        Species previousPokemon = null;
		    	// Adding all Pokemon in JSON to xmi iteratively
				for(int i = 0; i < pokemonList.size(); i++)
				{
					// Get ith pokemon in list 
				    JSONObject pokemon = (JSONObject) ((JSONArray) pokemonList).get(i);
				    
				    // Use custom method to parse to hashmap
				    HashMap<String, String> pokemonHashMap = parsePokemonObject(pokemon);
				    
				    // Create instance of said pokemon
				    Species pokemonSpecies = DomainFactory.eINSTANCE.createSpecies();
				    
				    // Set name of instance to name in hashmap
				    pokemonSpecies.setName((String) pokemonHashMap.get("name"));
				    
				    pokemonSpecies.setIcon((String) pokemonHashMap.get("icon"));
				    
				    // Retrieve genus from hashmap
				    String currentGenus = (String) pokemonHashMap.get("genus");
				    
				    // Retrieve egg group from hashmap
				    String eggGroup = (String) pokemonHashMap.get("egg_group");
				    
				    // Retrieve egg group from hashmap
				    String shape = (String) pokemonHashMap.get("shape");
				    
				    // Retrieve name of pokemon it evolves from from hashmap
				    String evolvesFrom = (String) pokemonHashMap.get("evolves");
			
				    // if this pokemon evoles from a different pokemon...
				    if(!(evolvesFrom.equals("No evolution"))) {
				    	pokemonSpecies.setEvolvesFrom(previousPokemon);
				    	previousPokemon.setEvolvesTo(pokemonSpecies);
				    	System.out.println(pokemonSpecies.getName() 
				    			+ " evolves from " + evolvesFrom);

				    }
				    // Set the previous variable to the current pokemon
				    previousPokemon = pokemonSpecies;
				    
				    // If we have not seen the genus before...
				    if(!genera.contains(currentGenus)){
				    	// Add the genus name to the array
				    	genera.add(currentGenus);
				    	
				    	// Create instance of the new genus
				    	Genus newGen = DomainFactory.eINSTANCE.createGenus();
				    	
				    	// Set name of the instance from the name in hashmap
				    	newGen.setName(currentGenus);
				    	
				    	// Set shape of the instance from the shape in hashmap
				    	newGen.setAnatomy(shape);
				    	
				    	// Add the pokemon instance to the genus instance
				    	newGen.getSpecies().add(pokemonSpecies);
				    	
				    	// Add the new genus instance to an array for later use
				    	generaInstances.add(newGen);
				    	
				    	// If the egg group is plant ...
				    	if(eggGroup.equals("plant")) {
				    	
				    		// add the genus to the generalClassPlants class
				    		generalClassPlants.getGenera().add(newGen);
				    	
				    	// Else if the egg group is mineral ...
				    	}else if(eggGroup.equals("mineral")) {
				    	
				    		// add the genus to the generalClassMineral class
				    		generalClassMineral.getGenera().add(newGen);
			    		
				    	// Else if the egg group is bug ...
				    	}else if(eggGroup.equals("bug")) {
				    	
				    		// add the genus to the general Arthropods class
				    		generalArthropodsClass.getGenera().add(newGen);
				    	
				    	// Else if the egg group is flying ...
			    		}else if(eggGroup.equals("flying") || shape.equals("wings")) {
				    	
			    			// add the genus to the bird class
				    		birdClass.getGenera().add(newGen);
			    		
				    	// Else if the egg group is fairy ...
			    		}else if(eggGroup.equals("fairy")) {
				    	
			    			// add the genus to the mythical class
				    		mythicalClass.getGenera().add(newGen);
			    		
				    	// Else if the egg group is dragon ...
			    		}else if(eggGroup.equals("dragon")) {
				    	
			    			// add the genus to the reptile class
				    		reptileClass.getGenera().add(newGen);
			    		
				    	// Else if the egg group starts with water ...
			    		}else if(eggGroup.startsWith("water") || shape.equals("fish")) {
				    	
			    			// add the genus to the fish class
				    		fishClass.getGenera().add(newGen);
			    		
				    	// Else ...
				    	}else {
				    	
				    		// add the genus to the mammal class
				    		mammalClass.getGenera().add(newGen);
				    	}
				   
				    // If not new genus
				    }else {
				    
				    	// Search for the genus in the list ...
				    	for(Genus gen : generaInstances) {
				    		if(gen.getName().equals(currentGenus)) {
				    	
				    			// And add it to the existing instance
				    			gen.getSpecies().add(pokemonSpecies);
				    		}
				    	}
				    }
				}
		    } catch (FileNotFoundException e) {
		        e.printStackTrace();
		    } catch (IOException e) {
		        e.printStackTrace();
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		}
		
		// ADD RELATIONSHIPS BETWEEN ANATOMIES IN GENUS
		
		{
			HashMap<String, ArrayList<Genus>> anatomyMap = new HashMap<>();
			
			for (Genus genus : generaInstances)
			{
				if (anatomyMap.containsKey(genus.getAnatomy())) {
					anatomyMap.get(genus.getAnatomy()).add(genus);
				} else {
					ArrayList<Genus> anatomyList = new ArrayList<>();
					anatomyList.add(genus);
					anatomyMap.put(genus.getAnatomy(), anatomyList);
				}
					
			}
			for (Genus genus : generaInstances)
			{
				genus.getSameAnatomy().addAll(anatomyMap.get(genus.getAnatomy()));
				genus.getSameAnatomy().remove(genus);
			}
		}
		
		String fileSeparator = System.getProperty("file.separator");
        
        try {
            File file = new File("src-gen" + fileSeparator + "file.xmi");
        	FileOutputStream fop = new FileOutputStream(file);
        	if(!file.exists()) {
        		file.createNewFile();
        	}
        	domainResource.save(fop, null);
        	fop.flush();
        	fop.close();
        } catch (Exception e){
        	System.out.println("Can not write new file due to :" + e );
        }
        System.out.println("Completed serializing...");
	}
	
	
	private static HashMap<String, String> parsePokemonObject(JSONObject pokemon) 
	{	
		HashMap<String, String> pokemonInstance = new HashMap<String, String>(); 
	    //Get Pokemon name
	    String name = (String) pokemon.get("name"); 
	    name = name.substring(0, 1).toUpperCase() + name.substring(1);
	    pokemonInstance.put("name", name);
	    
	    //Get Pokemon genus
	    JSONArray genera = (JSONArray) pokemon.get("genera");
	    String genus = (String) ((JSONObject) genera.get(2)).get("genus"); 
	    pokemonInstance.put("genus", genus);
	    
	    //Get Pokemon egg_group
	    String egg_group =  ((JSONObject) ((JSONArray) pokemon.get("egg_groups")).get(0)).get("name").toString();  
	    pokemonInstance.put("egg_group", egg_group);
	    
	    //Get Pokemon egg_group
	    String shape =  ((JSONObject) pokemon.get("shape")).get("name").toString();  
	    pokemonInstance.put("shape", shape);
	    
	    /*
	     *  ICON URL IS "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/X.png"
	     *  where X can be swapped with the order of the pokemon
	     */
	    String icon = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/" + pokemon.get("id").toString() +".png"; 
	    pokemonInstance.put("icon", icon);

	    
	    //Check if it evolves from a pokemon
	    String evolves = "No evolution";
	    if(!((JSONObject) pokemon.get("evolves_from_species") == null)) {
	    	evolves = ((JSONObject) pokemon.get("evolves_from_species")).get("name").toString();
	    } 
	    pokemonInstance.put("evolves", evolves);

	    return pokemonInstance;
	}
	
} //RaResourceImpl