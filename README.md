# TDT4250-PokeDex
Semester project in the course TDT4250 - Advanced Software Design
Group members:
- Odd Gunnar Aspaas
- Andreas Kristiansen Melzer
- Alexander Staff
- Robin Staff


# Using the [PokeDex API](https://pokeapi.co/docs/v2.html/#pokemon-section) to build the Tree of Life 

![alt text](https://github.com/oddaspa/TDT4250-PokeDex/blob/master/prestudy/img/tree_of_life_darwin.jpg "Tree of Life Darwin")


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
3. [Instantiating pokemon models](#init_models)
4. [Building the diagram editor](#editor)
5. [Editing and transforming the models](#transform)
6. [User guide](#guide)
7. [Dependencies](#dependencies)


<a name="import_data"></a>
### Import data from API
Using a python script and the API provided from [PokeAPI](https://pokeapi.co) we dumped all 807 pokemon into a single JSON file which we will use in the project. See [the notebook](https://github.com/oddaspa/TDT4250-PokeDex/blob/master/prestudy/python_retrival/PokeDex%20API.ipynb) to see how we did it.

<a name="build_emf"></a>
### Building the EMF model
The greatest challenge in finding a good model was deciding how we would use the PokeAPI to achieve a good level of complexity. We needed more cross-model relations than are immediately obvious with Pokemon. After looking into using the "habitate" attribute we landed on using the "shape" attribute. Pokemon in the API are seperated into 14 different shapes (which we call "Anatomy" in the model) which gives us the relations we need. 

<a name="init_models"></a>
### Instantiating pokemon models

<a name="editor"></a>
### Building the diagram editor

<a name="transfrom"></a>
### Editing and transforming the models

<a name="guide"></a>
### User guide

<a name="transfrom"></a>
### Dependencies

Need Simple JSON from [here](https://code.google.com/archive/p/json-simple/downloads).
