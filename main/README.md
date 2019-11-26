# TDT4250-PokeDex
Semester project in the course TDT4250 - Advanced Software Design
Group members:
- Odd Gunnar Aspaas
- Andreas Kristiansen Melzer
- Alexander Staff
- Robin Staff


# Using the [PokeDex API](https://pokeapi.co/docs/v2.html/#pokemon-section) to build the Tree of Life 

![Darwin's Tree of Life](https://github.com/oddaspa/TDT4250-PokeDex/blob/master/prestudy/img/tree_of_life_darwin.jpg "Tree of Life Darwin")

We looked for a domain with a structure that would be interesting to model with EMF. At first we considered using data from the [Open Tree of Life](https://opentreeoflife.github.io/), but when we discovered a data source that described Pokemon in a similar way, we quickly decided that modeling Pokemon would be more interesting.


## Classification
In order to classify the Pokemon, we borrowed terminology from biological taxonomy in order to describe the hierarchy found in the data. Pokemon with different names are each a species. Pokemon in the same evolutionary tree are in the same genus. Pokemon in the same genus also share Anatomy, and Habitat (these terms are expanded upon [here](#build_emf)). The three highest levels of our Taxonomy have no explicit mapping to concepts within the Pokemon world, but are rather a mix of concepts in order to build an interesting structure. Kingdom is our highest level, and splits the Pokemon concept, "egg groups" in to three categories: Plants, Animals, and Minerals. Furthermore the Phylum-level separates bugs from animals, and finally the Class-level separates into birds, fish, and mammals.




TODOS:
- [x] Retrieve JSON data
- [X] Make anatomy relations on genera
- [X] Build EMF model of the data
- [ ] Instantiate the model from data
- [ ] Build diagram editor 
- [ ] Additional transformation and manipulation
- [ ] Finish filling out readme


1. [Import data from API](#import_data)
2. [Building the EMF model](#build_emf)
3. [Instantiating Pokemon models](#init_models)
4. [Building the diagram editor](#editor)
5. [Editing and transforming the models](#transform)
6. [User guide](#guide)
7. [Dependencies](#dependencies)


<a name="import_data"></a>
### Import data from API
Using a python script and the API provided from [PokeAPI](https://pokeapi.co) we dumped all 807 Pokemon into a single JSON file which we will use in the project. See [the notebook](https://github.com/oddaspa/TDT4250-PokeDex/blob/master/prestudy/python_retrival/PokeDex%20API.ipynb) to see how we did it.

<a name="build_emf"></a>
### Building the EMF model
The greatest challenge in finding a good model was deciding how we would use the PokeAPI to achieve a good level of complexity. We needed more cross-model relations than are immediately obvious with Pokemon. After looking into using the "habitat" attribute we landed on using the "shape" attribute. Pokemon in the API are separated into 14 different shapes (which we call "Anatomy" in the model) which gives us the relations we need. 

<a name="init_models"></a>
### Instantiating Pokemon models

<a name="editor"></a>
### Building the diagram editor

<a name="transfrom"></a>
### Editing and transforming the models

<a name="guide"></a>
### User guide

<a name="transfrom"></a>
### Dependencies

Need Simple JSON from [here](https://code.google.com/archive/p/json-simple/downloads).
