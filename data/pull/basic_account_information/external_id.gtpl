{{if .results}}
    {{ with index .results 0 }}
        {{ .externalCustomerId }}
    {{ end }}
{{else}}
    -1
{{end}}