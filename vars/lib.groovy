def test() {
import groovy.yaml.YamlBuilder

def yamlBuilder = new YamlBuilder()
yamlBuilder{
    car{
        name 'Volvo'
        make 'Kyiv'
        other{
            param1 'param1'
            param2 'param2'
        }
    }
}

File filename1 = new File ("out1.yaml")
filename1.write(yamlBuilder.toString())
println(filename1)

}
