CREATE TABLE venda_item (
  id bigint(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  venda_id_venda bigint(20) NOT NULL,
  produto_id_produto bigint(20) NOT NULL,
  valor decimal(19,2) DEFAULT NULL,
  qtde decimal(19,2) DEFAULT NULL,
  FOREIGN KEY (venda_id_venda) REFERENCES venda(id),
  FOREIGN KEY (produto_id_produto) REFERENCES produto(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8