# Groovy eachWithIndex() Potential IndexOutOfBoundsException

This example demonstrates a common issue encountered when using Groovy's `eachWithIndex()` method.  If you try to access elements beyond the list's bounds within the loop, a runtime `IndexOutOfBoundsException` may occur. The included code showcases this risk and proposes a solution.

The `bug.groovy` file contains the erroneous code, while `bugSolution.groovy` offers a corrected version.  Be mindful of index boundaries when using iterators like `eachWithIndex()` to prevent unexpected exceptions.