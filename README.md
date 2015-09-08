# Eclipse Datasets

## What is this?

This is a library for handling Data in Java. It is inspired in part by [NumPy](http://www.numpy.org/) and aims to provide similar functionality.

The [Eclipse Dataset](https://github.com/jonahkichwacoders/org.eclipse.dataset) project is a fork of the [Eclipse Dawnsci](https://github.com/eclipse/dawnsci) project that extracts Datasets and its associated Maths libraries.

## Why use it?

* **Familiar.** Provide familiar functionality, especially to NumPy users.
* **Robust.** Has test suite and is used in production heavily at [Diamond Light Source](http://www.diamond.ac.uk/).
* **No more passing double[].** IDataset provide a consistent object for basing APIs on with significantly improved clarity over using double arrays or similar.
* **Optimized.** Optimized for speed and getting better all the time.
* **Scalable.** Allows handling of data sets larger than available memory with ["Lazy Datasets"](org.eclipse.dataset/src/org/eclipse/dataset/ILazyDataset.java).
* **Focus on your algorithms.** By reusing this library it allows you to focus on your code.

## Getting Started

Clone the examples repo and have a look. Browse over to the [examples](https://github.com/jonahkichwacoders/org.eclipse.dataset.examples) repo for more information.

## Contributing

At the moment this is work in progress and essentially a proposal on the way forward. Join us for discussion https://dev.eclipse.org/mailman/listinfo/science-iwg

## License

The code is distributed under the [Eclipse Public License](LICENSE).
