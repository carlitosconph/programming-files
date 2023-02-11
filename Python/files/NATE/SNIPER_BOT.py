from requests_html import HTMLSession, AsyncHTMLSession


url = 'https://articulo.mercadolibre.com.mx/MLM-902324715-rca-freidora-de-aire-digital-35-l-rc-102-_JM#position=24&search_layout=grid&type=item&tracking_id=d7e45da9-343f-435e-879d-8ad753f8eba5&c_id=/home/promotions-recommendations/element&c_element_order=1& c_uid=91e84f56-b421-48af-b9e1-576091e71ae3'


session = HTMLSession()

r = session.get(url)


