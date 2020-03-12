package Peliculas2;

import java.net.URL;
import java.sql.Time;

public class Trailer {

		private URL url;
		private Time duraacion;
		
		public URL getUrl() {
			return url;
		}
		public void setUrl(URL url) {
			this.url = url;
		}
		public Time getDuraacion() {
			return duraacion;
		}
		public void setDuraacion(Time duraacion) {
			this.duraacion = duraacion;
		}
		public Trailer() {
			super();
			
		}
}
