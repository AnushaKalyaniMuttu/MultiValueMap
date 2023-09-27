/*MultiValueMap:
*MultiValueMap is not part of the standard Java Collections Framework but is typically found in libraries like Apache Commons Collections.
*It's designed for scenarios where a single key can be associated with multiple values.
*This allows you to have one key mapped to a collection of values, such as a list or set.
*/
MultiValueMap<String, Integer> multiValueMap = new ArrayListValuedHashMap<>();
multiValueMap.put("apple", 3);
multiValueMap.put("apple", 5);
Collection<Integer> appleValues = multiValueMap.get("apple"); // Retrieves [3, 5]

