package domain.util;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
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

	public static void main(String[] args) throws IOException {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("domain", new DomainResourceFactoryImpl());
		Resource domainResource = resSet.createResource(URI.createURI("test.ra"));
		Domain domain = DomainFactory.eINSTANCE.createDomain();
		
		// FILL IN ALL NEEDED ATTRIBUTES
		domain.setName("Pokemons");
		System.out.println(resSet);
		domainResource.getContents().add(domain);
		
		// ADD KINGDOMS
		Kingdom k1 = DomainFactory.eINSTANCE.createKingdom();
		k1.setName("Animalia");
		
		// ADD PHYLUM
		Phylum p1 = DomainFactory.eINSTANCE.createPhylum();
		p1.setName("Chordates");
		
		// ADD CLASS
		Class c1 = DomainFactory.eINSTANCE.createClass();
		c1.setName("Mammal");
		
		// ADD GENUS
		Genus g1 = DomainFactory.eINSTANCE.createGenus();
		g1.setName("Poison Pin");
		g1.setAnatomy("Upright");
		g1.setHabitat("Grassland");
		
		// FILL IN ALL NEEDED ATTRIBUTES
		Species species1 = DomainFactory.eINSTANCE.createSpecies();
		species1.setName("Nidoran");

		Species species2 = DomainFactory.eINSTANCE.createSpecies();
		species1.setName("Nidorino");
		
		Species species3 = DomainFactory.eINSTANCE.createSpecies();
		species1.setName("Nidoking");
		
		// ADD DEPENDENCIES
		
		species1.setEvolvesTo(species2);
		species2.setEvolvesFrom(species1);
		species2.setEvolvesTo(species3);
		species3.setEvolvesFrom(species2);
		
		k1.getPhyla().add(p1);
		p1.getClasses().add(c1);
		c1.getGenera().add(g1);
		g1.getSpecies().add(species1);
		g1.getSpecies().add(species2);
		g1.getSpecies().add(species3);
		domain.getKingdoms().add(k1);
		
		
		domainResource.save(System.out, null);
	}
	
} //RaResourceImpl