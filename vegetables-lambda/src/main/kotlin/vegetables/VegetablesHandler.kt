package vegetables

import daikon.lambda.HttpHandler


class VegetablesHandler(
    private val repository: FakeVegetableRepository = FakeVegetableRepository()
) : HttpHandler() {
    override fun routing() {
        get("/", ListAction(repository))
        get("/:name", DetailsAction(repository))
    }
}