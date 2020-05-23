# The Collection Interface
The **Collection Interface** is the foundation upon which the collections framework is built. It declares the core methods that all collections will have.

Because all collections implement Collection, familiarity with its methods is necessary for a clear understanding of the framework. Several of these methods can throw an **UnsupportedOperationException**.

## Methods

### boolean add(Object obj)
Adds obj to the invoking collection. Returns true if obj was added to the collection. Returns false if obj is already a member of the collection, or if the collection does not allow duplicates.

### boolean addAll(Collection c)
Adds all the elements of c to the invoking collection. Returns true if the operation succeeds (i.e., the elements were added). Otherwise, returns false.

### void clear( )
Removes all elements from the invoking collection.

### boolean contains(Object obj)
Returns true if obj is an element of the invoking collection. Otherwise, returns false.

### boolean containsAll(Collection c)
Returns true if the invoking collection contains all elements of c. Otherwise, returns false.

### boolean equals(Object obj)
Returns true if the invoking collection and obj are equal. Otherwise, returns false.

### int hashCode( )
Returns the hash code for the invoking collection.

### boolean isEmpty( )
Returns true if the invoking collection is empty. Otherwise, returns false.

### Iterator iterator( )
Returns an iterator for the invoking collection.

### boolean remove(Object obj)
Removes one instance of obj from the invoking collection. Returns true if the element was removed. Otherwise, returns false.

### boolean removeAll(Collection c)
Removes all elements of c from the invoking collection. Returns true if the collection changed (i.e., elements were removed). Otherwise, returns false.

### boolean retainAll(Collection c)
Removes all elements from the invoking collection except those in c. Returns true if the collection changed (i.e., elements were removed). Otherwise, returns false.

### int size( )
Returns the number of elements held in the invoking collection.

### Object[ ] toArray( )
Returns an array that contains all the elements stored in the invoking collection. The array elements are copies of the collection elements.

### Object[ ] toArray(Object array[ ])
Returns an array containing only those collection elements whose type matches that of array.
