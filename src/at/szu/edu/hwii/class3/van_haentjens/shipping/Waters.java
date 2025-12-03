package at.szu.edu.hwii.class3.van_haentjens.shipping;

public class Waters {
    private final String name;
    private final GermanArticle article;
    private final boolean navigable;

    protected Waters(String name, GermanArticle  article, boolean navigable) {
        this.name = name;
        this.article = article;
        this.navigable = navigable;
    }

    protected Waters flowsInto(){
        return null;
    }

    public String getName() {
        return name;
    }

    public String getName(Boolean kleinGeschrieben) {
        if (!kleinGeschrieben) {
            return article+ " " +name;
        }

        return article.toString().toLowerCase() +  " " + name;
    }

    /*public Sea getSea(){

    }

     */
    public boolean isNavigable() {
        return navigable;
    }

    @Override
    public String toString() {
        return "Waters{" +
                "name='" + name + '\'' +
                ", article=" + article +
                ", navigable=" + navigable +
                '}';
    }
}
