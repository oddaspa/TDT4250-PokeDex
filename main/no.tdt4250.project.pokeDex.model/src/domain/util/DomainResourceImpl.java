package domain.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
		
		// CREATE EENUMS
		ArrayList<String> kingdoms = new ArrayList<>();
		kingdoms.add("plant");
		kingdoms.add("animals");
		kingdoms.add("minerals");
		
		ArrayList<String> phyla = new ArrayList<>();
		phyla.add("Chordata");
		phyla.add("Angiospemophyta");
		phyla.add("Arthpods");
		phyla.add("Vertebrate");
		phyla.add("Metamorphic");
		
		ArrayList<String> classes = new ArrayList<>();
		classes.add("Fish");
		classes.add("Bird");
		classes.add("Mammal");
		
		// IF CONDITIONS
		ArrayList<String> animals = new ArrayList<>();
		animals.add("flying");
		animals.add("water1");
		animals.add("water2");
		animals.add("water3");
		animals.add("ground");
		animals.add("fairy");
		animals.add("humanshape");
		animals.add("monster");
		animals.add("dragon");
		animals.add("ditto");
		animals.add("indeterminate");

		
		
		
		// GLOBAL ARRAYS
		ArrayList<String> genera = new ArrayList<>();
		ArrayList<Genus> generaInstances = new ArrayList<>();
		// FILL IN ALL NEEDED ATTRIBUTES
		domain.setName("Pokemons");
		System.out.println(resSet);
		domainResource.getContents().add(domain);
		
		// ADD KINGDOMS
		Kingdom animalia = DomainFactory.eINSTANCE.createKingdom();
		animalia.setName("Animalia");
		
		Kingdom plantae = DomainFactory.eINSTANCE.createKingdom();
		plantae.setName("Plantae");
		
		Kingdom mineralia = DomainFactory.eINSTANCE.createKingdom();
		mineralia.setName("Mineralia");
		
		
		// ADD PHYLUM
		Phylum chordates = DomainFactory.eINSTANCE.createPhylum();
		chordates.setName("Chordates");
		
		Phylum generalAnimals = DomainFactory.eINSTANCE.createPhylum();
		generalAnimals.setName("Not specified animals");
		
		Phylum generalPlant = DomainFactory.eINSTANCE.createPhylum();
		generalPlant.setName("Not specified plants");
		
		Phylum generalMineral = DomainFactory.eINSTANCE.createPhylum();
		generalMineral.setName("Not specified mineral");
		
		
		// ADD CLASS
		Class mammals = DomainFactory.eINSTANCE.createClass();
		mammals.setName("Mammal");
		
		Class birds = DomainFactory.eINSTANCE.createClass();
		birds.setName("Bird");
		
		Class fish = DomainFactory.eINSTANCE.createClass();
		fish.setName("Fish");
		
		// GENERAL CLASSES
		Class generalClassAnimal = DomainFactory.eINSTANCE.createClass();
		generalClassAnimal.setName("Some type of animal");
		
		Class generalClassPlants = DomainFactory.eINSTANCE.createClass();
		generalClassPlants.setName("Some type of plant");
		
		Class generalClassMineral = DomainFactory.eINSTANCE.createClass();
		generalClassMineral.setName("Some type of mineral");
		
		
		// READING AND PARSING JSON
		
		{
		    //JSON parser object to parse read file
		    JSONParser jsonParser = new JSONParser();
		     
		    try (FileReader reader = new FileReader("pokemons.json"))
		    {
		        //Read JSON file
		        Object obj  = jsonParser.parse(reader);
		        JSONArray pokemonList = (JSONArray) new JSONParser().parse((String) obj);

		    	// TRY TO ADD ALL POKEMON
				for(int i = 0; i < pokemonList.size(); i++)
				{
				      JSONObject pokemon = (JSONObject) ((JSONArray) pokemonList).get(i);
				      HashMap pokemonHashMap = parsePokemonObject(pokemon);
				      Species pokemonSpecies = DomainFactory.eINSTANCE.createSpecies();
				      pokemonSpecies.setName((String) pokemonHashMap.get("name"));
				      String currentGenus = (String) pokemonHashMap.get("genus");
				      String eggGroup = (String) pokemonHashMap.get("egg_group");
				      if(!genera.contains(currentGenus)){
				    	  genera.add(currentGenus);
				    	  Genus newGen = DomainFactory.eINSTANCE.createGenus();
				    	  newGen.setName(currentGenus);
				    	  newGen.getSpecies().add(pokemonSpecies);
				    	  generaInstances.add(newGen);
				    	  if(eggGroup.equals("plant")) {
				    		  generalClassPlants.getGenera().add(newGen);
				    	  }else if(eggGroup.equals("mineral")) {
				    		  generalClassMineral.getGenera().add(newGen);
				    	  }else {
				    		  generalClassAnimal.getGenera().add(newGen);
				    	  }
				      }else {
				    	  for(Genus gen : generaInstances) {
				    		  if(gen.getName().equals(currentGenus)) {
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
		
		// ADD CLASSES TO PHYLA
		generalPlant.getClasses().add(generalClassPlants);
		generalAnimals.getClasses().add(generalClassAnimal);
		generalMineral.getClasses().add(generalClassMineral);
		
		// ADD PHLYA TO KINGDOMS
		plantae.getPhyla().add(generalPlant);
		animalia.getPhyla().add(generalAnimals);
		mineralia.getPhyla().add(generalMineral);
		
		// ADD KINGDOMS TO DOMAIN
		domain.getKingdoms().add(plantae);
		domain.getKingdoms().add(animalia);
		domain.getKingdoms().add(mineralia);
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
	
	
	//TODO: refactor to get all attributes of pokemon
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
	    return pokemonInstance;
	}
	
} //RaResourceImpl