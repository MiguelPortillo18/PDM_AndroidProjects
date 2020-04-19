```public class CarListAdapter extends RecyclerView.Adapter<ListaCarrosAdapter.CarListViewHolder> {

    private String[] titulos;
    private Integer[] fotos;

    public ListaCarrosAdapter(String[] titulos, Integer[] fotos) {
        this.titulos = titulos;
        this.fotos = fotos;
    }

    @NonNull
    @Override
    public CarListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_carro, viewGroup, false);
        return new CarListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarListViewHolder viewHolder, int position) {
        viewHolder.bind(titulos[position], fotos[position]);
    }

    @Override
    public int getItemCount() {
        return fotos.length;
    }

    public class CarListViewHolder extends RecyclerView.ViewHolder {

        public TextView texto;
        public ImageView imagen;

        public CarListViewHolder(@NonNull View itemView) {
            super(itemView);
            texto = itemView.findViewById(R.id.titulo);
            imagen = itemView.findViewById(R.id.fotografia);
        }

        void bind(final String carname, final Integer carimage) {
            this.texto.setText(carname);
            this.imagen.setImageDrawable(itemView.getContext().getDrawable(carimage));
        }
    }
}```
