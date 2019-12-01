# Installation guide
Clone the repository. Import the model project into the workspace (no.tdt4250.project.pokeDex.model). If there are dependencies are bundled, but if there are issues look at the [Dependencies](#dependencies). 

# User guide
After you are finished with the installation guide you should have an eclipse IDE looking like this:
![After Installation](https://github.com/oddaspa/TDT4250-PokeDex/blob/master/main/prestudy/img/IDE-1.jpg "After Installation")

Right click the root folder and press Run As -> Eclipse Application. In the Runtime Eclipse IDE expand the representation.aird -> expand Professor Viewpoint -> expand diagram and open PokemonWorld. When this is done your IDE should look like this:
![Runtime Environment](https://github.com/oddaspa/TDT4250-PokeDex/blob/master/main/prestudy/img/IDE-2.jpg "Runtime Environment")

In the PokemonWorld diagram there are several fliters and layers. There are several creation tools as well. To create a Pokemon press createPokemon in the Species Tools. Click and drag in the diagram to create the pokemon entity. Same for every creation tool. Double click the name of a node to edit it.

To create relationships between nodes use the appropriate edge tool. Click on the relationship you want to create, click on the source node then the target node. The relation based edge should now be created.   


# TDT4250-PokeDex
Semester project in the course TDT4250 - Advanced Software Design
Group members:
- Odd Gunnar Aspaas
- Andreas Kristiansen Melzer
- Alexander Staff
- Robin Staff


# Using the [PokeDex API](https://pokeapi.co/docs/v2.html/#pokemon-section) to build the Tree of Life 

![Darwin's Tree of Life](https://github.com/oddaspa/TDT4250-PokeDex/blob/master/main/prestudy/img/tree_of_life_darwin.jpg "Tree of Life Darwin")

We looked for a domain with a structure that would be interesting to model with EMF. At first we considered using data from the [Open Tree of Life](https://opentreeoflife.github.io/), but when we discovered a data source that described Pokemon in a similar way, we quickly decided that modeling Pokemon would be more interesting as modeling Pokemon comes with its own set of challenges such as how to find cross-model relations as Pokemon do not function exactly like real lifeforms.


## Classification
In order to classify the Pokemon, we borrowed terminology from biological taxonomy in order to describe the hierarchy found in the data. Pokemon with different names are each a species. Pokemon in the same evolutionary tree are in the same genus. Pokemon in the same genus also share Anatomy, and Habitat (these terms are expanded upon [here](#build_emf)). The three highest levels of our Taxonomy have no explicit mapping to concepts within the Pokemon world, but are rather a mix of concepts in order to build an interesting structure. Kingdom is our highest level, and splits the Pokemon concept, "egg groups" in to three categories: Plants, Animals, and Minerals. Furthermore the Phylum-level separates bugs from animals, and finally the Class-level separates into birds, fish, and mammals.




TODOS:
- [X] Retrieve JSON data
- [X] Make anatomy relations on genera
- [X] Build EMF model of the data
- [X] Instantiate the model from data
- [X] Build diagram editor 
- [X] Additional transformation and manipulation
- [X] Finish filling out readme


1. [Import data from API](#import_data)
2. [Building the EMF model](#build_emf)
3. [Instantiating Pokemon models](#init_models)
4. [Building the diagram editor](#editor)
5. [Dependencies](#dependencies)
6. [Changing the dataset](#change)


<a name="import_data"></a>
### Import data from API
Using a python script and the API provided from [PokeAPI](https://pokeapi.co) we dumped all 807 Pokemon into a single JSON file which we will use in the project. See [the notebook](https://github.com/oddaspa/TDT4250-PokeDex/blob/master/main/prestudy/python_retrival/PokeDex%20API.ipynb) to see how we did it.

<a name="build_emf"></a>
### Building the EMF model
The greatest challenge in finding a good model was deciding how we would use the PokeAPI to achieve a good level of complexity. We needed more cross-model relations than are immediately obvious with Pokemon. After looking into using the "habitat" attribute we landed on using the "shape" attribute. Pokemon in the API are separated into 14 different shapes (which we call "Anatomy" in the model) which gives us the relations we need. 

<a name="init_models"></a>
### Instantiating Pokemon models
There is a REST call to the PokemonAPI, which returns data which we save as a JSON object with all our Pokemon. We parse the JSON object and create XMI instances with help of our domain factory. 

In the runtime enviroment we use our XMI-file to show the data in a diagram with help of odesign. 

<a name="editor"></a>
### Building the diagram editor
We imported the generated XMI from the modelling project into runtime. Then we created a modelling project and a view point project. We coupled the domain XMI and odesign in representations.aird. We created poemonWorld diagram, and made a node for each Eclass. Finaly we made a relation-based edge for all relationships. 

<a name="transfrom"></a>
### Dependencies
Need Simple JSON from [here](https://code.google.com/archive/p/json-simple/downloads). <br/>
Need Eclipse Layout Kernel from [here](https://www.eclipse.org/elk/)

<a name="change"></a>
### Changing the dataset
Once the team started working with the front end it started impacting performance that there were over 800 entities in the diagram. To improve performace a filter was added to get the number of entities retrieved from the API down to 151 (the first generation of Pokemon) as well as compressing the images we use.
