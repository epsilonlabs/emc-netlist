pre {
  var hashCmpByName = Hash!Component.all.mapBy(h|h.circuitName);
}

rule MatchComponents
  match c: Concise!Component
  with h: Hash!Component from: hashCmpByName.getOrDefault(c.name, Set {})
{
  compare: true
}

rule MatchRoots
  match cr : Concise!Netlist in: Concise.resource.contents
  with hr : Hash!HashModel in: Hash.resource.contents
{
  // This will only be true if they are both roots of their models
  compare: cr.eContainer() == hr.eContainer()
}